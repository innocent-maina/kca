// Using OpenGL, write a program that allows interactive translation
// the first initial point is a small red square amd when the letter t or T is pressed the square moves 90 degrees to the right
// the smalle red square is the first initial point and is located at the bottom left corner of the screen

#include <GL/glut.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>


#define PI 3.14159265358979323846

// Global variables
int width = 500, height = 500; // Window size
int XO, YO; // Initial mouse position
float theta = 0.0; // Rotation angle
float scale = 10.0; // Scaling factor
float translate = 10.0; // Translation factor

// Initialization routine.
void setup(void)
{
  glClearColor(1.0, 1.0, 1.0, 0.0);
}

// declare a small red square located at the bottom left corner of the screen
// when the letter t or T is pressed the square moves 90 degrees to the right

// Mouse input processing routine.
void mouseControl(int button, int state, int x, int y)
{
  if (button == GLUT_LEFT_BUTTON && state == GLUT_DOWN)
  {
    XO = x;
    YO = y;
  }
}

// Mouse motion processing routine.
void mouseMotion(int x, int y)
{
  theta = theta + (x - XO)/10.0;
  scale = scale + (y - YO) / 100.0;
  if (scale < 0.0)
    scale = 0.0;
  XO = x;
  YO = y;
  glutPostRedisplay();
}


// Drawing routine.
void drawScene(void)
{
  glClear(GL_COLOR_BUFFER_BIT);

  glLoadIdentity();
  glTranslatef(0.0, 0.0, -50.0);
  glRotatef(theta, 0.0, 0.0, 1.0);
  glScalef(scale, scale, scale);

  glColor3f(1.0, 0.0, 0.0);
  glBegin(GL_POLYGON);
    glVertex3f(-1.0, -1.0, 0.0);
    glVertex3f(-1.0, 1.0, 0.0);
    glVertex3f(1.0, 1.0, 0.0);
    glVertex3f(1.0, -1.0, 0.0);
  glEnd();

  glFlush();
}

// OpenGL window translate routine.
void winReshapeFcn(GLint newWidth, GLint newHeight)
{
  glViewport(0, 0, newWidth, newHeight);

  glMatrixMode(GL_PROJECTION);
  glLoadIdentity();
  gluOrtho2D(-100.0, 100.0, -100.0, 100.0);

  glMatrixMode(GL_MODELVIEW);
  glLoadIdentity();

  glutPostRedisplay();
}

// Keyboard input processing routine.
void keyInput(unsigned char key, int x, int y)
{
  switch(key)
  {
    case 27:
      exit(0);
      break;
    case 't':
      translate = translate + 90.0;
      glutPostRedisplay();
      break;
    case 'T':
      translate = translate + 90.0;
      glutPostRedisplay();
      break;
    default:
      break;
  }
}

// Main routine.
int main(int argc, char **argv)
{
  glutInit(&argc, argv);

  glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
  glutInitWindowSize(width, height);
  glutInitWindowPosition(100, 100);
  glutCreateWindow("fourTranslation.c");
  setup();
  glutDisplayFunc(drawScene);
  glutReshapeFunc(winReshapeFcn);
  glutKeyboardFunc(keyInput);
  glutMouseFunc(mouseControl);
  glutMotionFunc(mouseMotion);
  glutMainLoop();
}

// Compile: gcc fourTranslation.c -o fourTranslation -lGL -lGLU -lglut
