.PHONY = build clean

CONTAINER = lynxtp/openjdk-jre
VERSION = 8

.built: Dockerfile
	@docker build --pull -t $(CONTAINER):$(VERSION) .
	@touch $@

build: .built

clean:
	@rm -f .built
