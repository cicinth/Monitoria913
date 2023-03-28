package org.example;


import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> futureResult = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000);
                return 10;
            }
        });
        while(!futureResult.isDone()){
            Thread.sleep(500);
            System.out.println("Aguardando termino...");
        }

        System.out.println("não bloqueou");
        int result = futureResult.get();
        System.out.println("Resultado" + result);

        executorService.shutdown();

    }
}
