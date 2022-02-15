package sectors.stringbuilder.example1;

class StringsTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        long time1, time2;

        long startTime = System.nanoTime();

        for(int x=0; x<999; x++){
            builder.append(x);
            builder.append(" ");
        }
        time1 = System.nanoTime() - startTime;
        String numbers = builder.toString();
        System.out.println("Time 1: " + time1);
        System.out.println(numbers);

        startTime = System.nanoTime();
        String numbers2 = "";
        for(int i=0; i<999; i++){
            numbers2 = numbers2 + i + " ";
        }
        time2 = System.nanoTime() - startTime;
        System.out.println("Time2: " + time2);
        System.out.println(numbers2);
        System.out.println("Time2/Time1 = " + (time2/time1));

    }
}