private static int largestNumber(int data) {
    int number = data;
    int[] times = new int[10];
    while (number != 0) {
        if (number == 0) {
            break;
        }
        int val = number % 10;
        times[val]++;
        number /= 10;
    }
    String largestNumber = "";
    for (int i = 9; i >= 0; i--) {
        for (int j = 0; j < times[i]; j++) {
            largestNumber += i;
        }
    }
    return Integer.parseInt(largestNumber);
}
