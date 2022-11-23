// Using OpenGL, write a program that allows interactive rotation of a point via the mouse.


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

// Initialization routine.
void setup(void)
{
  glClearColor(1.0, 1.0, 1.0, 0.0);
}

// // Mouse input processing routine.
// void mouseControl(int button, int state, int x, int y)
// {
//   if (button == GLUT_LEFT_BUTTON && state == GLUT_DOWN)
//   {
//     XO = x;
//     YO = y;
//   }
// }

// // Mouse motion processing routine.
// void mouseMotion(int x, int y)
// {
//   theta = theta + (x - XO);
//   scale = scale + (y - YO) / 100.0;
//   if (scale < 0.0)
//     scale = 0.0;
//   XO = x;
//   YO = y;
//   glutPostRedisplay();
// }
// make the mouse control the rotation of the point a little slower and follow the mouse more closely

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

// Routine to output interaction instructions to the C++ window.
void printInteraction(void)
{
  printf("Interaction: \n");
  printf("Press the left mouse button and drag to rotate the point.\n");
}

// Drawing routine.
void drawScene(void)
{
  glClear(GL_COLOR_BUFFER_BIT);

  glLoadIdentity();
  glTranslatef(0.0, 0.0, -5.0);
  glRotatef(theta, 0.0, 0.0, 1.0);
  glScalef(scale, scale, scale);

  glColor3f(0.0, 0.0, 1.0);
  glBegin(GL_POLYGON);
  glVertex3f(0.0, 0.0, 0.0);
  glVertex3f(0.0, 1.0, 0.0);
  glVertex3f(1.0, 1.0, 0.0);
  glVertex3f(1.0, 0.0, 0.0);
// // make the square a little smaller
// draw a rectangle at the center of the screen



  glEnd();

  glutSwapBuffers();
}
// make the square smaller and give it a gradient of yellow and orange
// void drawScene(void)
// {
//   glClear(GL_COLOR_BUFFER_BIT);

//   glLoadIdentity();
//   glTranslatef(0.0, 0.0, -5.0);
//   glRotatef(theta, 0.0, 0.0, 1.0);
//   glScalef(scale, scale, scale);

//   glColor3f(1.0, 1.0, 0.0);
//   glBegin(GL_POLYGON);
//   glVertex3f(0.0, 0.0, 0.0);
//   glVertex3f(0.0, 0.25, 0.0);
//   glVertex3f(0.25, 0.25, 0.0);
//   glVertex3f(0.25, 0.0, 0.0);
//   glEnd();

//   glutSwapBuffers();
// }
// make the square smaller and place it at the center of the screen






// OpenGL window reshape routine.
void resize(int w, int h)
{
  glViewport(0, 0, w, h);
  glMatrixMode(GL_PROJECTION);
  glLoadIdentity();
  gluPerspective(40.0, (float)w / (float)h, 1.0, 100.0);
  glMatrixMode(GL_MODELVIEW);
}

// Keyboard input processing routine.

void keyInput(unsigned char key, int x, int y)
{
  switch (key)
  {
  case 27:
    exit(0);
    break;
  default:
    break;
  }
}

// Main routine.
int main(int argc, char **argv)
{
  printInteraction();
  glutInit(&argc, argv);

  glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB);
  glutInitWindowSize(width, height);
  glutInitWindowPosition(100, 100);
  glutCreateWindow("fourRotation.c");
  setup();
  glutDisplayFunc(drawScene);
  glutReshapeFunc(resize);
  glutKeyboardFunc(keyInput);
  glutMouseFunc(mouseControl);
  glutMotionFunc(mouseMotion);
  glutMainLoop();

  return 0;
}

// Path: four/fourScaling.c
