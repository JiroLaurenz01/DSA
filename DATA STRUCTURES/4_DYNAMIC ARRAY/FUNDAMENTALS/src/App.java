public class App {
    public static void main(String[] args) throws Exception {
        /*  DYNAMIC ARRAY = ArrayList IN JAVA OFFERS RESIZABLE, INDEXED ARRAYS FOR DYNAMIC DATA STORAGE.
                            IT ADJUSTS SIZE AUTOMATICALLY, SIMPLIFYING ELEMENT MANAGEMENT.
                            WIDELY USED FOR ITS CONVENIENCE IN HANDLING DYNAMIC DATA STRUCTURES.            
            
            ADVANTAGES:
                1. RANDOM ACCESS OF ELEMENTS. O(1)
                2. GOOD LOCALITY OF REFERENCE AND DATA CACHE UTILIZATION.
                3. EASY TO INSERT/DELETE AT THE END.

            DISADVANTAGES:
                1. WASTES MORE MEMORY.
                2. SHIFTING ELEMENTS IS TIME CONSUMING. O(n)
                3. EXPANDING / SHRINKING THE ARRAY IS TIME CONSUMING. O(n)

            USES OF LINKED LIST:
                1. ONLINE SHOPPING CARTS
                2. CONTACT LISTS
                3. PLAYLIST MANAGEMENT  */ 

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("League of Legends");
        dynamicArray.add("Fortnite");
        dynamicArray.add("Crossfire");
        dynamicArray.add("Farlight");
        dynamicArray.add("Call of Duty Warzone");

        System.out.println(dynamicArray);
    }
}
