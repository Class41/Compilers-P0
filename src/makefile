all:
	javac com/umsl/vasylonufriyev/DatasourceParser/*.java \
	com/umsl/vasylonufriyev/*.java && \
	jar cfm P0.jar MANIFEST.MF com/umsl/vasylonufriyev\
	/DatasourceParser/*.java \
	com/umsl/vasylonufriyev/*.java
clean:
	find . -name "*.class" -type f -delete
