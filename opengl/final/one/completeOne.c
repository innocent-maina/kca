// in openGl draw an image that has the following
// 1. green triangle
// 2. blue square
// 3. red point
// 4. thick yellow line
// 5. dashed purple line
// 6. pink point
// at different points so that all are visible

#include <GL/glut.h>
#include <GL/gl.h>
#include <GL/glu.h>

void display(void)
{
    // green triangle
    glClear(GL_COLOR_BUFFER_BIT);
    glColor3f(0.0, 1.0, 0.0);
    glBegin(GL_TRIANGLES);
    glVertex2f(0.50, 0.50);
    glVertex2f(0.75, 0.75);
    glVertex2f(0.75, 0.50);
    glEnd();
    // blue square
    glColor3f(0.0, 0.0, 1.0);
    glBegin(GL_POLYGON);
    glVertex2f(0.1, 0.1);
    glVertex2f(0.4, 0.1);
    glVertex2f(0.4, 0.4);
    glVertex2f(0.1, 0.4);
    glEnd();
    //  red point
    glColor3f(1.0, 0.0, 0.0);
    glBegin(GL_POINTS);
    glVertex2f(0.9, 0.9);
    glPointSize(10.0);
    glEnd();
    // thick yellow line
    glLineWidth(5.0);
    glColor3f(1.0, 1.0, 0.0);
    glBegin(GL_LINES);
    glVertex2f(0.9, 0.1);
    glVertex2f(0.8, 0.2);
    glEnd();
    // dashed purple line
    glLineWidth(1.0);
    glEnable(GL_LINE_STIPPLE);
    glLineStipple(1, 0x00FF);
    glColor3f(1.0, 0.0, 1.0);
    glBegin(GL_LINES);
    glVertex2f(0.1, 0.9);
    glVertex2f(0.2, 0.8);
    glEnd();
    // white point
    glColor3f(1.0, 1.0, 1.0);
    glBegin(GL_POINTS);
    glVertex2f(0.8, 0.8);
    glPointSize(10.0);
    glEnd();
    glFlush();
}

void init(void)
{
    glClearColor(0.0, 0.0, 0.0, 0.0);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0.0, 1.0, 0.0, 1.0);
}

int main(int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(250, 250);
    glutInitWindowPosition(100, 100);
    glutCreateWindow("Complete One");
    init();
    glutDisplayFunc(display);
    glutMainLoop();
    return 0;
}
