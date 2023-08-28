package concurrency.inpracticebook.listing5.t8;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;

public class FileCrawler implements Runnable {

    private final BlockingQueue<File> fileQueue = null;
    private final FileFilter fileFilter = null;
    private final File root = null;


    @Override
    public void run() {
        try {
            crawl(root);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void crawl(File root) throws InterruptedException {
        File[] entries = root.listFiles(fileFilter);
        if (entries != null) {
            for (File entry:entries) {
                if (entry.isDirectory()) {
                    crawl(entry);
                } else if (/*!alreadyIndexed(entry)*/true) {
                    fileQueue.put(entry);
                }
            }
        }
    }
}
