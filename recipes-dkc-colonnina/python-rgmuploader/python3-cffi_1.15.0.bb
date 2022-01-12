
SUMMARY = "Foreign Function Interface for Python calling C code."
HOMEPAGE = "http://cffi.readthedocs.org"
AUTHOR = "Armin Rigo, Maciej Fijalkowski <python-cffi@googlegroups.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

inherit pypi setuptools3

SRC_URI[md5sum] = "f3a3f26cd3335fc597479c9475da0a0b"
SRC_URI[sha256sum] = "920f0d66a896c2d99f0adbb391f990a84091179542c205fa53ce5787aff87954"

PYPI_PACKAGE = "cffi"

DEPENDS += " "
RDEPENDS_${PN} = "python3-pycparser"

BBCLASSEXTEND = "native nativesdk"
