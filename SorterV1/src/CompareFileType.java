public class CompareFileType implements Comparable<FileInfo> {
    @Override
    public int compareTo(FileInfo f1, FileInfo f2) {
        return f1.getType().compareTo(f2.getType());
    }
}
