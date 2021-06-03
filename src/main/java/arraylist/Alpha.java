package arraylist;

public class Alpha {//TODO: Rename this.

    private static final Object[] EMPTY_ELEMENTDATA = {};//Initiliazing the arraylist EMPTY_ELEMENTDATA
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};//  Initializing it with the default capacity 10

    public Alpha(){
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;// here, this keyword is returning the instance of ArrayList
    }

    transient Object[] elementData;
}
