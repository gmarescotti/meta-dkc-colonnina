
SUMMARY = "C parser in Python"
HOMEPAGE = "https://github.com/eliben/pycparser"
AUTHOR = "Eli Bendersky <eliben@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c28cdeabcb88f5843d934381b4b4fea"

inherit pypi setuptools3

SRC_URI[md5sum] = "48f7d743bf018f7bb2ffc5fb976d1492"
SRC_URI[sha256sum] = "e644fdec12f7872f86c58ff790da456218b10f863970249516d60a5eaca77206"

PYPI_PACKAGE = "pycparser"

DEPENDS += " "
RDEPENDS_${PN} = ""

