
SUMMARY = "REPL plugin for Click"
HOMEPAGE = "https://github.com/untitaker/click-repl"
AUTHOR = "Markus Unterwaditzer <markus@unterwaditzer.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fee2943fdd4d8afbac9ccc1c8ac137d5"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/60/30/11d3f09eff5ae3627bca79563855035e8d241444520500a3c7914eae6a74/click-repl-0.2.0.tar.gz"
SRC_URI[md5sum] = "97a5d1dc17b0e4eb09d836872ceb78c8"
SRC_URI[sha256sum] = "cd12f68d745bf6151210790540b4cb064c7b13e571bc64b6957d98d120dacfd8"

S = "${WORKDIR}/click-repl-0.2.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
