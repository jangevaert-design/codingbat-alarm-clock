public class alarmClock {
  public String alarmClock(int day, boolean vacation) {
    if (day > 0 && day < 6 && !vacation) {
      return "7:00";
    } else if (((day == 0 || day == 6) && ! vacation) || (day > 0 && day < 6 && vacation)) {
      return "10:00";
    } else {
      return "off";
    }
  }

}
