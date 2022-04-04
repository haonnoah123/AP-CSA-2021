import java.util.List;

public class SeatingChart {

  private Student[][] seats;

  public SeatingChart(List<Student> studentList, int rows, int cols) {
    Student[][] seatsN = new Student[rows][cols];
    int n = 0;
    for (int col = 0; col < cols; col++) {
      for (int row = 0; row < rows; row++) {
        if (n != studentList.size()) {
          seatsN[row][col] = studentList.get(n);
        }
        if (n < studentList.size()) {
          n++;
        }

      }
    }
    seats = seatsN;
  }

  public int removeAbsentStudents(int allowedAbsences) {
    int count = 0;
    for (int row = 0; row < seats.length; row++) {
      for (int col = 0; col < seats[0].length; col++) {
        Student s = seats[row][col];
        if(s != null && s.getAbsenceCount() > allowedAbsences){
          seats[row][col] = null;
          System.out.println(row + " " + col);
          count++;
        }
      }
    }
    return count;
  }

  public void printSeatingChart() {
    for (int r = 0; r < seats.length; r++) {
      for (int c = 0; c < seats[r].length; c++) {
        if (seats[r][c] != null)
          System.out.print(seats[r][c].getName() + seats[r][c].getAbsenceCount() + "\t\t");
        else
          System.out.print("null" + "\t\t");
      }
      System.out.println();
    }
  }

  public String getSeatInfo(int r, int c) {
    if (seats[r][c] != null)
      return seats[r][c].getName() + seats[r][c].getAbsenceCount();
    else
      return null;
  }
}
