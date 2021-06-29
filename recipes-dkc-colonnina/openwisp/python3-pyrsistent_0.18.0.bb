
SUMMARY = "Persistent/Functional/Immutable data structures"
HOMEPAGE = "http://github.com/tobgu/pyrsistent/"
AUTHOR = "Tobias Gustafsson <tobias.l.gustafsson@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.mit;md5=a4b94c2b800b582a8d3925a9939cbf44"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/f4/d7/0fa558c4fb00f15aabc6d42d365fcca7a15fcc1091cd0f5784a14f390b7f/pyrsistent-0.18.0.tar.gz"
SRC_URI[md5sum] = "1b335355d3eb40d0870988a1a41894b3"
SRC_URI[sha256sum] = "773c781216f8c2900b42a7b638d5b517bb134ae1acbebe4d1e8f1f41ea60eb4b"

S = "${WORKDIR}/pyrsistent-0.18.0"

DEPENDS += " ${PYTHON_PN}-pytest-runner-native"
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
