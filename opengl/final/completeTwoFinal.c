// Write an OpenGL program that allows interactive creation of polygons via mouse input.
// The polygon is drawn in one color and filled with another color.
// The program allows the user to complete the polygon by pressing the right mouse button.
// The program allows the user to clear the screen by pressing the middle mouse button.
// The program allows the user to quit the program by pressing the left mouse button.
// The program allows the user to change the color of the polygon by pressing the 'c' key.
// The program allows the user to change the fill color of the polygon by pressing the 'f' key.
// The program allows the user to change the width of the polygon by pressing the 'w' key.

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

// allow the program to create polygons with straight lines from the mouse

void drawPolygon() {
    int i;
    glColor3ub(polyData.color.r, polyData.color.g, polyData.color.b);
    glLineWidth(polyData.width);
    glBegin(GL_LINE_STRIP);
    for (i = 0; i < polyData.polygon.numPoints; i++) {
        glVertex2i(polyData.polygon.points[i].x, polyData.polygon.points[i].y);
    }
    glEnd();
    glFlush();
}

void drawFilledPolygon() {
    int i;
    glColor3ub(polyData.fillColor.r, polyData.fillColor.g, polyData.fillColor.b);
    glBegin(GL_POLYGON);
    for (i = 0; i < polyData.polygon.numPoints; i++) {
        glVertex2i(polyData.polygon.points[i].x, polyData.polygon.points[i].y);
    }
    glEnd();
    glFlush();
}

void display() {
    clearScreen();
    drawFilledPolygon();
    drawPolygon();
}

void mouse(int button, int state, int x, int y) {
    if (button == GLUT_LEFT_BUTTON && state == GLUT_DOWN) {
        exit(0);
    } else if (button == GLUT_MIDDLE_BUTTON && state == GLUT_DOWN) {
        clearScreen();
    } else if (button == GLUT_RIGHT_BUTTON && state == GLUT_DOWN) {
        polyData.polygon.numPoints = 0;
        display();
    }
}

// allow more than one polygon to be created at a time

void mouseMotion(int x, int y) {
    if (polyData.polygon.numPoints < MAXPOINTS) {
        polyData.polygon.points[polyData.polygon.numPoints].x = x;
        polyData.polygon.points[polyData.polygon.numPoints].y = 500 - y;
        polyData.polygon.numPoints++;
        display();
    }
}

// after the mouse is released the user can create another polygon by pressing the right mouse button

void mousePassiveMotion(int x, int y) {
    if (polyData.polygon.numPoints > 0) {
        polyData.polygon.points[polyData.polygon.numPoints].x = x;
        polyData.polygon.points[polyData.polygon.numPoints].y = 500 - y;
        display();
    }
}

void keyboard(unsigned char key, int x, int y) {
    if (key == 'c') {
        polyData.color.r = rand() % 256;
        polyData.color.g = rand() % 256;
        polyData.color.b = rand() % 256;
        display();
    } else if (key == 'f') {
        polyData.fillColor.r = rand() % 256;
        polyData.fillColor.g = rand() % 256;
        polyData.fillColor.b = rand() % 256;
        display();
    } else if (key == 'w') {
        polyData.width = rand() % 10;
        display();
    }
}

void motion(int x, int y) {
    if (polyData.polygon.numPoints < MAXPOINTS) {
        polyData.polygon.points[polyData.polygon.numPoints].x = x;
        polyData.polygon.points[polyData.polygon.numPoints].y = 500 - y;
        polyData.polygon.numPoints++;
        display();
    }
}

void reshape(int w, int h) {
    glViewport(0, 0, w, h);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0, w, 0, h);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
}

void init() {
    glClearColor(1.0, 1.0, 1.0, 0.0);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0.0, 500.0, 0.0, 500.0);
}


int main(int argc, char** argv) {
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500, 500);
    glutInitWindowPosition(100, 100);
    glutCreateWindow("Complete Two Again");
    initPolyData();
    glutDisplayFunc(display);
    glutMouseFunc(mouse);
    glutKeyboardFunc(keyboard);
    glutMotionFunc(motion);
    glutReshapeFunc(reshape);
    glClearColor(1.0, 1.0, 1.0, 1.0);
    glShadeModel(GL_FLAT);
    glutMainLoop();
    return 0;
}

