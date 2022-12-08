class MockTriangleProgram
{
    public static void main(String[] args)
    {
        MockTriangle mocker = new MockTriangle();

        System.out.println("Enter the data for the triangle");
        mocker.input();
        mocker.calculate();
        System.out.println("The data computed is");
        mocker.display();
    }
}