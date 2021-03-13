package kata.kyu7.overTheRoad;

class CodeWars {
    public static long overTheRoad(long address, long n) {
        long home = (n * 2) - ((address / 2) + (address / 2));

        if (address % 2 != 0){
            return home;
        }
        return home + 1;
    }
}
