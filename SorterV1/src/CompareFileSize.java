public class CompareFileSize implements Comparable<FileInfo> {
    @Override
    public int compareTo(FileInfo f1, FileInfo f2) {
            return f1.getSize() - f2.getSize();
    }
}
