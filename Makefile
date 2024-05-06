run-dist:
	./app/build/install/app/bin/app

build-dist:
	make -C app build-dist

build-run: 
	make -C app build-run

build:
	make -C app build

report:
	make -C app report
