//  In OpenGL, draw an image that includes  a thick line

#include <GL/glut.h>
#include <GL/gl.h>
#include <GL/glu.h>

void display(void)
{
    glClear(GL_COLOR_BUFFER_BIT);
    glLineWidth(5.0);
    glBegin(GL_LINES);
    glVertex2f(0.0, 0.0);
    glVertex2f(0.5, 0.5);
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

int main(int argc, char** argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(250, 250);
    glutInitWindowPosition(100, 100);
    glutCreateWindow("Thick Line");
    init();
    glutDisplayFunc(display);
    glutMainLoop();
    return 0;
}
