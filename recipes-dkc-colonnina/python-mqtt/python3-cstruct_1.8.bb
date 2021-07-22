
SUMMARY = "C-style structs for Python"
HOMEPAGE = "http://github.com/andreax79/python-cstruct"
AUTHOR = "Andrea Bonomi <andrea.bonomi@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=14a4f0f65d1bd9b7637061c55f4fd596"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/b2/8c/4774cb22c44919133e4d5430cb9757185c03a9f66c035dd077d990b03a55/cstruct-1.8.tar.gz"
SRC_URI[md5sum] = "9ca11e346fa36123d77834b893d78d18"
SRC_URI[sha256sum] = "e11684fd5e8b9a44834f96dc88293cd7cf5cb393bddee4a9f83ef3f9824bb7af"

S = "${WORKDIR}/cstruct-1.8"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
