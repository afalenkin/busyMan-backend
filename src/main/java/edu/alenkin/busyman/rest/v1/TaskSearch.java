package edu.alenkin.busyman.rest.v1;

import edu.alenkin.busyman.model.Category;
import edu.alenkin.busyman.model.Priority;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Alenkin Andrew
 * oxqq@ya.ru
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskSearch {
    private String title;
    private Integer completed;
    private Priority priority;
    private Category category;

    private Integer pageNumber;
    private Integer pageSize;
    private String sortColumn;
    private String sortDirection;
}
