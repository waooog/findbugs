
class NullDeref5 {
  Object lock;

  void foo() {
  Object lck = lock;
    synchronized (lck) {
    try {
	System.out.println("foo");
    } catch (Exception e) {
	e.printStackTrace();
    } finally {
       if (lock != null) {
	lock.notify();
       }
    }
    }
  }
}
