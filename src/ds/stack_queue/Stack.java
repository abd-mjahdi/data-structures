package ds.stack

public class Stack{
    private int[] data;
    private int top=-1;
    private int capacity=16;

    public Stack(){
        this.data = new int[this.capacity];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    private void resize(){
        int[] newData = new int[capacity*2];
        for(int i=0;i<size();i++){
            newData[i] = data[i];
        }
        data = newData;
        capacity*=2;
    }

    public void push(int value){
        if(size()==capacity){
            resize();
        }
        top++;
        data[top]=value;
    }

    public int pop(){
        if(isEmpty()) {
            throw new NoSuchElementException("stack is empty");
        }
        int value = data[top];
        top--;
        return value;
        
    }

    public int peek(){
        if(isEmpty()) throw new NoSuchElementException("stack is empty");
        return data[top];
    }

    public void clear(){
        top=-1;
    }
    @Override
    public String toString(){
        String result="";
        for(int i=0;i<size();i++){
            if(i<size()-1){
                result+=data[i]+","
            }else{
                result+=data[i];
            }
        }
        return "["+result+"]";
    }
}