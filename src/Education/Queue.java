    package Education;

    public class Queue {
        char q[];
        int putloc, getloc  ;
        Queue(int size ){
            q = new char[size+1];
            putloc = getloc=0;
        }
        void put(char ch){
            if(putloc == q.length-1){
                System.out.println("Queue is full");
                return;
            }
            putloc++;
            q[putloc] = ch;
        }
        char get(){
            if(putloc == getloc){
                System.out.println(" - Queue is empty");
                return (char) 0;
            }
            getloc++;
            return q[getloc];
        }
    }
