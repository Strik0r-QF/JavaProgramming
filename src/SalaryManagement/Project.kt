package SalaryManagement

class Project(
    private var _projectName: String,
    private var _projectManager: Employee
) {
    var projectName: String
        get() = _projectName
        set(value) {
            _projectName = value
        }

    var projectManager: SalaryManagement.Employee
        get() = _projectManager
        set(value) {
            _projectManager = value
        }
}
