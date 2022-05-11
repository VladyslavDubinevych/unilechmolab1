package iot;

public record hotel(int NumberOfVisitors,String name,int NumberOfRooms)
{
    public static String Filling="Full";
    public hotel() {
        this(0,"",0);
    }

    /* public hotel(int NumberOfVisitors,String name,int NumberOfRooms) {
        this(0,"",0); */



    @Override
    public String toString() {
        return "hotel:\n" +
                "\tNumberOfVisitors -> " + NumberOfVisitors + "\n" +
                "\tname -> " + name + "\n" +
                "\tNumberOfRooms -> " + NumberOfRooms + "\n";

    }



}
