package staticList;

import common.IOInterface;

/**
 * @author NeTissues
 * @see staticList.StaticInterface
 */
public class StaticList implements StaticInterface<Double>{

    public int lastIndex;

    public double[] data;
    public int arraySize;

    public StaticList() {}

    //void returning methods
    @Override
    public void create(int arraySize){
        this.data = new double[arraySize];
        this.arraySize = arraySize;
        this.lastIndex = -1;
        IOInterface.show("Created");
    }

    /**
     * Makes the <code>data</code> value into <code>null</code> and calls onto the Garbage Collector to free the space
     */
    @Override
    public void destroy(){
        this.data = null;
        System.gc();
    }

    @Override
    public void insert(int index, Double data){
        if (this.lastIndex == this.arraySize - 1)
            IOInterface.show("Structure is full");
        else if (index < 0) {
            IOInterface.show("Index lower than 0");
        }else if (index > this.arraySize - 1) {
            IOInterface.show("Index greater than array size");
        /*}else if (index == 0) {
            for (int i = this.lastIndex; i > 0; i--){//Search System.arraycopy() //IDK why, but I feel like this is bad
                this.data[i+1] = this.data[i];
            }
            this.data[0] = data;
            this.lastIndex++;*/
        }else {
            for (int i = this.lastIndex; i >= index; i--){//Search System.arraycopy() //IDK why, but I feel like this is bad
                this.data[i+1] = this.data[i];
            }
            this.data[index] = data;
            this.lastIndex++;
        }

    }

    @Override
    public void insertFirst(Double data){
        insert(0, data);
    }

    @Override
    public void insertLast(Double data){
        insert(this.lastIndex + 1, data);
    }

    @Override
    public void readList(){
        try {
            for (int i = 0; i <= this.lastIndex; i++) {
                IOInterface.show("Data" + "[" + i + "] = " + this.data[i]);
            }
        }catch (NullPointerException e){IOInterface.show("Null Pointer Exception has been thrown");}
    }

    //boolean returning methods
    @Override
    public boolean isEmpty(){
        return this.lastIndex == -1;
    }

    @Override
    public boolean isFull(){
        return ((this.arraySize - 1) == this.lastIndex);
    }
}