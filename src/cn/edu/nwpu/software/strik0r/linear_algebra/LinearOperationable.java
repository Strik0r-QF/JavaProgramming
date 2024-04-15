package cn.edu.nwpu.software.strik0r.linear_algebra;

public interface LinearOperationable {
    abstract LinearOperationable add(LinearOperationable o);
    abstract LinearOperationable scalarMultiply(double scalar);
}
