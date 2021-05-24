
SUMMARY = "cryptography is a package which provides cryptographic recipes and primitives to Python developers."
HOMEPAGE = "https://github.com/pyca/cryptography"
AUTHOR = "The Python Cryptographic Authority and individual contributors <cryptography-dev@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf405a8056a6647e7d077b0e7bc36aba"

SRC_URI = "https://files.pythonhosted.org/packages/9b/77/461087a514d2e8ece1c975d8216bc03f7048e6090c5166bc34115afdaa53/cryptography-3.4.7.tar.gz"
SRC_URI[md5sum] = "f24fb11c6d5beb18cbfe216b9e58c27e"
SRC_URI[sha256sum] = "3d10de8116d25649631977cb37da6cbdd2d6fa0e0281d014a5b7d337255ca713"

S = "${WORKDIR}/cryptography-3.4.7"

RDEPENDS_${PN} = "python3-cffi"

inherit setuptools3
