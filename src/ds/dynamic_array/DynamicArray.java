package ds.dynamic_array;

public class DynamicArray{
    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray(){
        this.capacity = 16;
        this.size = 0;
        this.data = new int[this.capacity];
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.data = new int[capacity];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int get(int index){
        if(index>size-1 || index<0){
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public void set(int index , int value){
        if(index>size-1 || index<0){
            throw new IndexOutOfBoundsException();
        }
        data[index] = value;
    }

    private void resize(){
        int[] newArray = new int[capacity*2];
        for(int i=0;i<size;i++){
            newArray[i]=data[i];
        }
        capacity*=2;
        data = newArray;
    }

    public void add(int value){
        if(size==capacity){
            this.resize();
        }
        data[size]=value;
        size++;
    }

    public void insert(int index, int value){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        if(size == capacity){
            resize();
        }

        for(int i = size; i > index; i--){
            data[i] = data[i - 1];
        }

        data[index] = value;
        size++;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        for(int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }

        size--;
    }

    public boolean contains(int value){
        for(int i=0;i<size;i++){
            if(data[i]==value){
                return true;
            }
        }
        return false;
    }

    public int indexOf(int value){
        for(int i=0;i<size;i++){
            if(data[i]==value) return i;
        }
        return -1;
    }

    public void clear(){
        size=0;
    }

    @Override
    public String toString(){

        if(size == 0) return "[]";
        String output = "[";

        for(int i = 0; i < size; i++){
            output += data[i];
            if(i != size - 1) output += ", ";
        }

        output += "]";
        return output;
    }





}