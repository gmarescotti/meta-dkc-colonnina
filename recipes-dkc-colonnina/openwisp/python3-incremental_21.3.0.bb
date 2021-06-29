
SUMMARY = "A small library that versions your Python projects."
HOMEPAGE = "https://github.com/twisted/incremental"
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6ca9b07f08e2c72d48c74d363d1e0e15"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/4f/c5/430765c697afc217c8491785de321a21fa4d983dda14bcd82feb965b0593/incremental-21.3.0.tar.gz"
SRC_URI[md5sum] = "9f7ad12e0c05a12cee52a7350976c4e3"
SRC_URI[sha256sum] = "02f5de5aff48f6b9f665d99d48bfc7ec03b6e3943210de7cfc88856d755d6f57"

S = "${WORKDIR}/incremental-21.3.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
