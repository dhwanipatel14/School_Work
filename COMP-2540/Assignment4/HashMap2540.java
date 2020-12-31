
import java.util.LinkedList;
import java.util.Random; 

public class HashMap2540<Key, Value> {
        private static final int INIT_CAPACITY = 1000000;
        private int n; // number of elements
        private int m; // hash table size
        private LinkedListForHash2540<Key, Value>[] st; 
        // array of linked-list.
        
        public HashMap2540() {
                this(INIT_CAPACITY);
        }

        // used in resize.
        public HashMap2540(int m) {
                this.m = m;
                st = (LinkedListForHash2540<Key, Value>[]) new LinkedListForHash2540[m];
                for (int i = 0; i < m; i++)
                        st[i] = new LinkedListForHash2540<Key, Value>();
        }

        // resize the hash table to have the given number of chains,
        // rehashing all of the keys
        private void resize(int n) {
                HashMap2540<Key, Value> temp = new HashMap2540<Key, Value>(n);
                for (int i = 0; i < m; i++) {
                        for (Key key : st[i].keys()) {
                                temp.put(key, st[i].get(key));
                        }
                }
                this.m = temp.m;
                this.n = temp.n;
                this.st = temp.st;
        }

        // hash value between 0 and m-1
        private int myhash(Key key) {
                int hash = 0;
                String k = (String) key; //here we assume keys are strings.
                for (int i = 0; i < k. length (); i++)
{hash = (37* hash) + Character.getNumericValue(k.charAt(i));}
                return Math.abs(hash) % m;
        }

        public Value get(Key key) {
                int i = myhash(key);
                return st[i].get(key);
        }

        public void put(Key key, Value val) {
  if (n >= 10 * m)
   resize(2 * m);
  if (st[myhash ( key )].get(key) == null)
   n ++;
  st[myhash ( key )]. put (key , val);
 }

        public void delete(Key key) {
                if (key == null)
                        throw new IllegalArgumentException("argument to delete() is null");
                if (st[myhash(key)].get(key)!=null)
                        n--;
                st[myhash(key)].delete(key);

                // halve table size if average length of list <= 2
                if (m > INIT_CAPACITY && n <= 2 * m)
                        resize(m / 2);
        }

        public LinkedList<Key> keys() {
                LinkedList<Key> queue = new LinkedList<Key>();
                for (int i = 0; i < m; i++) {
                        for (Key key : st[i].keys())
                                queue.add(key);
                }
                return queue;
        }
}

