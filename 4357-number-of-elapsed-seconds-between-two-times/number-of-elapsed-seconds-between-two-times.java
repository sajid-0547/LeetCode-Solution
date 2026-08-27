class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] s1 = startTime.split(":");
        String[] s2 = endTime.split(":");

        int startHour = Integer.parseInt(s1[0]);
        int startMinute = Integer.parseInt(s1[1]);
        int startSecond = Integer.parseInt(s1[2]);

        int endHour = Integer.parseInt(s2[0]);
        int endMinute = Integer.parseInt(s2[1]);
        int endSecond = Integer.parseInt(s2[2]);

        int a = startHour*3600+startMinute*60+startSecond;
        int b = endHour*3600+endMinute*60+endSecond;

        return b-a;
    }
}