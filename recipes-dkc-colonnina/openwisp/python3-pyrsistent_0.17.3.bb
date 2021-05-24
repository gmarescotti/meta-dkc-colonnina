
SUMMARY = "Persistent/Functional/Immutable data structures"
HOMEPAGE = "http://github.com/tobgu/pyrsistent/"
AUTHOR = "Tobias Gustafsson <tobias.l.gustafsson@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=5be65fef2abe996e6b193ab7f79c2427"

SRC_URI = "https://files.pythonhosted.org/packages/4d/70/fd441df751ba8b620e03fd2d2d9ca902103119616f0f6cc42e6405035062/pyrsistent-0.17.3.tar.gz"
SRC_URI[md5sum] = "cd38658ea772a7f9b12b6f9485a7018b"
SRC_URI[sha256sum] = "2e636185d9eb976a18a8a8e96efce62f2905fea90041958d8cc2a189756ebf3e"

S = "${WORKDIR}/pyrsistent-0.17.3"

RDEPENDS_${PN} = ""

inherit setuptools3
