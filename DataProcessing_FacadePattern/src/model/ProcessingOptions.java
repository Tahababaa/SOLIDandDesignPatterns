package model;

public class ProcessingOptions {
    private boolean removeMissingValues;
    private boolean sortBySalesDescending;
    private boolean showVisualization;

    public ProcessingOptions(boolean removeMissingValues, boolean sortBySalesDescending, boolean showVisualization) {
        this.removeMissingValues = removeMissingValues;
        this.sortBySalesDescending = sortBySalesDescending;
        this.showVisualization = showVisualization;
    }

    public boolean isShowVisualization() {
        return showVisualization;
    }

    public boolean isSortBySalesDescending() {
        return sortBySalesDescending;
    }

    public boolean isRemoveMissingValues() {
        return removeMissingValues;
    }
}
