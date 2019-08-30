all:
	javac com/umsl/vasylonufriyev/DatasourceParser/*.java \
	com/umsl/vasylonufriyev/*.java && \
    jar cfm P0.jar ./MANIFEST.MF ./com/umsl/vasylonufriyev/*.class \
    ./com/umsl/vasylonufriyev/DatasourceParser/*.class \
    ./com/umsl/vasylonufriyev/DataStructures/*.class

clean:
	find . -name "*.class" -type f -delete && \
	rm *.jar
clean-output:
	rm *.postorder *.preorder *.inorder
