public class LocationsStack {


    //
    // Public
    //
    public LocationsStack() {
        init();
    }

    public void push(Locations item) throws Exception{
        // Check for stack overflow.
        if (topPtr > 0) {
            topPtr = topPtr - 1;
            arr[topPtr] = item;
        } else {
           // Check for overflow
            //Throw exception
            throw new Exception();
        }
    }

    public Locations pop() throws Exception{
        Locations retVal = null;
        // Check for stack underflow.
        if (topPtr < CAPACITY) {
            retVal = arr[topPtr];
            topPtr = topPtr + 1;
        } else {
            // In case of underflow,
            // Throw exception
            throw new Exception();

        }
        return retVal;
    }

    public boolean isEmpty() {
        boolean retVal = false;
        if (topPtr == CAPACITY) {
            retVal = true;
        }
        return retVal;
    }

   /* public boolean isEmptyMo() {
        return (topPtr == CAPACITY);
    }*/


    //
    // Private
    //
    private final int CAPACITY = 60;
    private Locations[] arr = new Locations[CAPACITY];
    private int topPtr = 0;

    private void init() {
        for (int i = 0; i < CAPACITY; i++) {
            arr[i] = null;
        }
        topPtr = CAPACITY;
    }


}