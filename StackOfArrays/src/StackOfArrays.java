
class StackOfArrays {

    private char[] data;
    private int size = 0;
    private static final int DEFUALT = 10;

    public StackOfArrays() {
        this(DEFUALT);
    }

    public StackOfArrays(int capacity) {
        this.data = new char[capacity];
    }

    public char[] getData() {
        return data;
    }

    public void setData(char[] data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }
    
    public boolean isFull() {
        return (this.size == this.data.length);
    }


    public void push(char element) {
        if (this.size >= this.data.length){
            char[] temp = new char[this.data.length * 2];
            System.arraycopy(data, 0, temp, 0, this.data.length);
            data = temp;
        }
        data[size++] = element;
    }


    public char pop() {
        return data[--size];

    }
}
