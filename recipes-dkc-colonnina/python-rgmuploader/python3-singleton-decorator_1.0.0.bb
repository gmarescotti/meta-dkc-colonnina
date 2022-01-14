
SUMMARY = "A testable singleton decorator"
HOMEPAGE = "https://github.com/Kemaweyan/singleton_decorator"
AUTHOR = "Taras Gaidukov <kemaweyan@gmail.com>"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=af3e329722054c8e8aabaafe062e6d83"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/33/98/a8b5c919bee1152a9a1afd82014431f8db5882699754de50d1b3aba4d136/singleton-decorator-1.0.0.tar.gz"
SRC_URI[md5sum] = "9b0011c7d33a671bc02b58362ef3dc18"
SRC_URI[sha256sum] = "1a90ad8a8a738be591c9c167fdd677c5d4a43d1bc6b1c128227be1c5e03bee07"

S = "${WORKDIR}/singleton-decorator-1.0.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
