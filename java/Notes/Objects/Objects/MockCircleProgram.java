class MockCircleProgram {
    public static void main(String[] args)
    {
        MockCircle smallMockCircle = new MockCircle();
        MockCircle bigMockCircle = new MockCircle();


        System.out.println("---------------The system starts here------------------");
        System.out.println("\n\nEnter data for Small circle");
        smallMockCircle.getData();
        System.out.println("\n\nEnter data for Big circle");
        bigMockCircle.getData();

        // compute for both
        smallMockCircle.compute();
        bigMockCircle.compute();

        System.out.println("\n\nDisplay data for Small circle ----------->>>>>>>>>>>>>>>>>>");
        smallMockCircle.display();
        System.out.println("\n\nDisplay data for Small circle ----------->>>>>>>>>>>>>>>>>>");
        bigMockCircle.display();
    }
}