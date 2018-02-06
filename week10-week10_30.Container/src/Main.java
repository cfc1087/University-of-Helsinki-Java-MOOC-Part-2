
import containers.ContainerHistory;
import containers.ProductContainer;
import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {
        ContainerHistory mh;
        mh = new ContainerHistory();
        mh.add(1.0);
        mh.add(2.0);
        mh.add(4.0);
       mh.greatestFluctuation();
    }

}
