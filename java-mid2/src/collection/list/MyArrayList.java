//package collection.list;
//
//import java.util.Arrays;
//
//public class MyArrayList<E> implements MyList{
//
//    private static final int DEFAULT_CAPACITY = 5;
//
//    private Object[] elementData;
//    private int size = 0;
//
//    public MyArrayList(){
//        elementData = new Object[DEFAULT_CAPACITY];
//    }
//
//    public MyArrayList(int initialCapacity){
//        elementData = new Object[initialCapacity];
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public void add(E e) {
//
//        if(size == elementData.length){
//            grow();
//        }
//        elementData[size] = e;
//        size++;
//
//    }
//
//    @Override
//    public void add(int index, E e) {
//
//        if(size == elementData.length){
//            grow();
//        }
//        shiftRightFrom(index);
//        elementData[index] = e;
//        size++;
//
//    }
//
//    private void shiftRightFrom(int index){
//        for(int i = size; i > index; i--){
//            elementData[size] = elementData[size - 1];
//        }
//    }
//
//    @Override
//    public E get(int index) {
//        return (E) elementData[index];
//    }
//
//    @Override
//    public E set(int index, Object element) {
//        E oldValue = get(index);
//        elementData[index] = element;
//        return oldValue;
//    }
//
//    @Override
//    public E remove(int index) {
//        E oldValue = get(index);
//        shiftLeftFrom(index);
//        size--;
//        elementData[index] = null;
//        return oldValue;
//    }
//
//    private void shiftLeftFrom(int index) {
//        for (int i = index; i < size - 1; i++) {
//            elementData[i] = elementData[i + 1];
//        }
//    }
//
//    @Override
//    public int indexOf(Object o) {
//        for(int i = 0; i < size; i++){
//            if(o.equals(elementData[i])){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    private void grow(){
//        int oldCapacity = elementData.length;
//        int newCapacity = oldCapacity * 2;
//        elementData = Arrays.copyOf(elementData, newCapacity);
//    }
//
//    @Override
//    public String toString() {
//        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
//                size + ", capacity=" + elementData.length;
//    }
//
//
//}
