// draw a dot at the middle of the screen
// after 3 seconds make the dot ten times bigger at the same location

// Path: fourThree.c

// draw a dot at the middle of the screen

// after 3 seconds make the dot ten times bigger at the same location

#include <GL/glut.h>
#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <time.h>
#include <string.h>
#include <ctype.h>
#include <unistd.h>
#include <stdbool.h>

#define MAXPOINTS 1000

typedef struct {
    int x;
    int y;
} Point;

typedef struct {
    Point points[MAXPOINTS];
    int numPoints;
} Polygon;

typedef struct {
    int r;
    int g;
    int b;
} Color;

typedef struct {
    int width;
    Color color;
    Color fillColor;
    Polygon polygon;
} PolyData;

PolyData polyData;

void initPolyData() {
    polyData.width = 1;
    polyData.color.r = 0;
    polyData.color.g = 0;
    polyData.color.b = 0;
    polyData.fillColor.r = 255;
    polyData.fillColor.g = 255;
    polyData.fillColor.b = 255;
    polyData.polygon.numPoints = 0;
}

void clearScreen() {
    glClear(GL_COLOR_BUFFER_BIT);
    glFlush();
}

void drawDot(int x, int y, int size) {
    glColor3f(0.0, 0.0, 0.0);
    glPointSize(size);
    glBegin(GL_POINTS);
    glVertex2i(x, y);
    glEnd();
    glFlush();
}

void display() {
    clearScreen();
    drawDot(250, 250, 1);
}

void reshape(int w, int h) {
    glViewport(0, 0, w, h);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0.0, w, 0.0, h);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
}

void keyboard(unsigned char key, int x, int y) {
    switch (key) {
        case 'q':
            exit(0);
            break;
        case 'c':
            polyData.color.r = 255;
            polyData.color.g = 0;
            polyData.color.b = 0;
            break;
        case 'f':
            polyData.fillColor.r = 0;
            polyData.fillColor.g = 255;
            polyData.fillColor.b = 0;
            break;
        case 'w':
            polyData.width = 10;
            break;
        default:
            break;
    }
}

void mouse(int button, int state, int x, int y) {
    if (button == GLUT_LEFT_BUTTON && state == GLUT_DOWN) {
        exit(0);
    } else if (button == GLUT_MIDDLE_BUTTON && state == GLUT_DOWN) {
        clearScreen();
    } else if (button == GLUT_RIGHT_BUTTON && state == GLUT_DOWN) {
        polyData.polygon.points[polyData.polygon.numPoints].x = x;
        polyData.polygon.points[polyData.polygon.numPoints].y = y;
        polyData.polygon.numPoints++;
    }
}

void timer(int value) {
    drawDot(250, 250, 10);
}

int main(int argc, char **argv) {
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500, 500);
    glutInitWindowPosition(100, 100);
    glutCreateWindow("fourThree");
    initPolyData();
    glutDisplayFunc(display);
    glutReshapeFunc(reshape);
    glutKeyboardFunc(keyboard);
    glutMouseFunc(mouse);
    glutTimerFunc(3000, timer, 0);
    glutMainLoop();
    return 0;
}

