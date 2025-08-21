package ru.khananov;

public class MinimumNumberOfMovesToSeatEveryone {
  public static void main(String[] args) {
    System.out.println(new MinimumNumberOfMovesToSeatEveryone().minMovesToSeat(
        new int[]{73,6,5,72,49,56,13,67,74,51,10,47,1,55,76,78,26,68,80,3,73,74,65,7,40,96,43,80,83,93,51,22,30,14,54,84,9,12,33,53,50,91,8,18,34,20,71,58,58,8,65,92,58,85,75,23,92,91,39,3,14,24,79,75,63,8,59,67,4,99,24,60,14,91,82,17,95,91,40,43,88,22,53,19,12,98,99,87,40,1,9,14,49,30,30,60,19,44,42,84},
        new int[]{85,94,13,77,27,62,59,27,67,16,58,80,62,86,81,97,94,38,55,65,73,85,41,87,72,17,88,63,98,92,31,32,72,2,21,73,12,33,67,92,35,7,76,11,94,58,57,49,19,48,39,96,28,37,66,36,46,53,12,19,8,51,44,90,94,23,66,60,71,92,55,63,11,89,40,24,26,70,74,26,82,95,58,51,1,81,16,62,42,63,45,41,47,92,75,43,61,97,56,89}));
  }

  public int minMovesToSeat(int[] seats, int[] students) {
    int[] seatsCount = new int[101];
    int[] studentsCount = new int[101];
    for (int i = 0; i < seatsCount.length; i++) {
      if (i < seats.length) seatsCount[seats[i]]++;
      if (i < students.length) studentsCount[students[i]]++;
    }

    int result = 0;
    int seatIndex = 0;
    int studentIndex = 0;
    while (seatIndex < seatsCount.length && studentIndex < studentsCount.length) {
      if (seatsCount[seatIndex] == 0) {
        seatIndex++;
        continue;
      }
      if (studentsCount[studentIndex] == 0) {
        studentIndex++;
        continue;
      }
      result += Math.abs(seatIndex - studentIndex);

      if (seatsCount[seatIndex]-- == 1) {
        seatIndex++;
      }
      if (studentsCount[studentIndex]-- == 1) {
        studentIndex++;
      }
    }

    return result;
  }
}
