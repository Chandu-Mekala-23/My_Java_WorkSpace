public class MultiThreadingThreadClass extends Thread
    {
        public void run(){
            try{
                System.out.println("Thread  " + Thread.currentThread().getId() + "  Running");
            }
            catch(Exception e)
            {
                System.out.println("--ERROR OCCURED--" + e);
            }
        }
        public static void main(String args[])
        {
            
            for(int i=0;i<8;i++){

                 MultiThreadingThreadClass object = new MultiThreadingThreadClass();

                object.start();
            }
        }
    }