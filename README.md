from https://github.com/thenetcircle/faiss4j

#安装cpu版本
#更新conda

conda update conda

#先安装mkl

conda install mkl

#安装faiss-cpu

conda install faiss-cpu -c pytorch

#测试安装是否成功

python -c "import faiss"

