import java.util.Arrays;

class  Vessel<T> {
   private transient Object[] elementData;
public int size;
public Vessel(int n){
if (n<0)
    throw  new IllegalArgumentException("Illegal Capacity:" +n);


    this.elementData = new Object[n];}
public Vessel(){
    this(10);
}
public boolean add(T x){
    bigger(size+1);
elementData[size+1]=x;
return true;
}
public void bigger(int n){
    int old=elementData.length;
    if (n>elementData.length){
        Object oldData[]=elementData;
        int newshuzu=(old*3)/2+1;
        if (newshuzu<n){
            newshuzu=n;
            elementData= Arrays.copyOf(elementData,newshuzu)
        }
    }
}
public T sanchu(int index){
    check(index);
T oldvalue=(T) elementData[index];
yi(index);
}
public boolean check(int x){
    if (x<elementData.length)
        return true;
    return false;
}
public void yi(int index){
    int nummoved=size-1-index;
    if (nummoved>0){
        System.arraycopy(elementData,index+1,elementData,index,nummoved);
    elementData[--size]=null;
    }
}
public T cha(int index){
    T neirong=(T)elementData[index];
    return neirong;
}
public void change(int index,T x){
    elementData[index]=x;
}
}
