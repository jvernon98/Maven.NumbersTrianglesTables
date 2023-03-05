package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++) {
                String small = String.format("%3s |", i * j);
                sb.append(small);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++) {
                String large = String.format("%3s |", i * j);
                sb.append(large);
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 20; i++)
        {
            for (int j = 1; j <= 20; j++) {
                String table = String.format("%3s |", i * j);
                sb.append(table);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    }
