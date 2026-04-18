package StreamsPractiseCS;

import java.util.List;
import java.util.stream.Collectors;

import Models.WorkRecord;

public class StreamDm16 {
    public static void main(String[] args) {
        List<WorkRecord> workRec = WorkRecord.workRecList();

        List<String> list = workRec.stream()
                    .collect(Collectors.groupingBy(WorkRecord::getEmpName,Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue()>3)
                    .map(e -> e.getKey())
                    .toList();

        System.out.println(list);
    }
}
