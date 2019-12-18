public class CompareFileName implements Comparable<FileInfo> {
    @Override
    public int compareTo(FileInfo f1, FileInfo f2) {
        return f1.getName().compareTo(f2.getName());
    }
}
