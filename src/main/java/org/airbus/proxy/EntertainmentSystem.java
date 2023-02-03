package org.airbus.proxy;

public abstract class EntertainmentSystem implements IAccess {
    private final String title;
    private final String type;

    public void entertainmentSystem() {
//    System.out.println("Entertainment System");
//
//    Employee employee01 = new Employee("John", 6);
//    UserProxy proxyAccess = new UserProxy(employee01);
//    proxyAccess.grantAccess();
//
//    Employee employee02 = new Employee("Vicky", 3);
//    proxyAccess.setEmployee(employee02);
//    proxyAccess.grantAccess();
//
//
//    }
        public void selectTitle (String title, String type){
            System.out.println("Selected title: " + title + " of type " + type);
        }

        public void start () {
            System.out.println("Entertainment System started");
        }

        public void reset () {
            System.out.println("Entertainment System reset");
        }

        public void shutDown () {
            System.out.println("Entertainment System shut down");
        }

        public void addTitle (String title, String type){
            System.out.println("Title added: " + title + " of type " + type);
        }

        public void removeTitle (String title, String type){
            System.out.println("Title removed: " + title + " of type " + type);
        }

        public void analyzeUserBehavior () {
            System.out.println("User behavior analyzed");
        }
    }

}
